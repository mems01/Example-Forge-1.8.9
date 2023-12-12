import dev.deftu.gradle.utils.GameSide

plugins {
    java
    val dgtVersion = "1.22.0"
    id("dev.deftu.gradle.tools") version(dgtVersion)
    id("dev.deftu.gradle.tools.shadow") version(dgtVersion)
    id("dev.deftu.gradle.tools.blossom") version(dgtVersion)
    id("dev.deftu.gradle.tools.minecraft.loom") version(dgtVersion)
}

toolkit.useDevAuth()

toolkitLoomHelper  {
    useForgeMixin(modData.id)
    useMixinRefMap(modData.id)
    useTweaker("org.spongepowered.asm.launch.MixinTweaker")
    useProperty("mixin.debug.export", "true", GameSide.CLIENT)
    disableRunConfigs(GameSide.SERVER)
}

repositories {
    maven("https://maven.fabricmc.net/")
    maven("https://maven.deftu.dev/releases")
    mavenCentral()
}

dependencies {
    implementation(shade("net.fabricmc:sponge-mixin:0.12.5+mixin.0.8.5") {
        exclude(module = "launchwrapper")
        exclude(module = "guava")
        exclude(module = "gson")
        exclude(module = "commons-io")
    })
}