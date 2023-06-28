package ch09_3;

import java.io.IOException;
import java.lang.module.ModuleFinder;
import java.lang.module.ModuleReader;
import java.lang.module.ModuleReference;
import java.nio.ByteBuffer;
import java.nio.file.Path;
import java.util.Optional;
import java.util.Set;

public class ModuleReaderExample {
    public static void main(String[] args) throws IOException {
        ModuleFinder finder = ModuleFinder.ofSystem();
        Set<ModuleReference> moduleReferences = finder.findAll();

        for (ModuleReference moduleReference : moduleReferences) {
            ModuleReader module = moduleReference.open();
//            Path moduleLocation = moduleReference.location().orElseThrow();

            // 패키지명
            String packageName = "ch09_3";

            try (var moduleReader = moduleReference.open()) {
//                System.out.println(moduleReader.list().filter("").toString());

                moduleReader.list()
                        .filter(name -> name.startsWith(packageName.replace(".", "/") + "/"))
                        .forEach(name -> {
                            try {
                                Optional<ByteBuffer> bytes = moduleReader.read(name);
                                // TODO: bytes를 원하는 방식으로 처리
                                System.out.println(bytes.toString());
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        });
            }
        }
    }
}
