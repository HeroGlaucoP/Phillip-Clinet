class Compile:
        def __init__(self):
                self.run()

        def run(self):
                import os
                os.system("cd Phillipe && ./gradlew setupDecompWorkspace --stop && ./gradlew clean build")
                #os.system("cd Phillipe && ./gradlew runClient --stop && ./gradlew clean build")

                import shutil
                try:
                        shutil.copyfile("Phillipe/build/libs/phillipe-0.1-all.jar", "/home/glauco/.minecraft/mods/1pop-v0.2.jar")
                        print("Copiadokkk")
                except:
                        print("Ta sem o lib fodase")

                import sys
                sys.exit()

Compile();
