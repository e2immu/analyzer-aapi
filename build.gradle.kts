tasks.register("test") {
    dependsOn(gradle.includedBuild("e2immu-external-support").task(":test"))
//    dependsOn(gradle.includedBuild("e2immu-internal-graph").task(":test"))
    dependsOn(gradle.includedBuild("e2immu-cst-impl").task(":test"))
    dependsOn(gradle.includedBuild("e2immu-cst-io").task(":test"))
    dependsOn(gradle.includedBuild("e2immu-cst-print").task(":test"))
    dependsOn(gradle.includedBuild("e2immu-java-parser").task(":test"))
    dependsOn(gradle.includedBuild("e2immu-java-bytecode").task(":test"))
    dependsOn(gradle.includedBuild("e2immu-inspection-integration").task(":test"))
    dependsOn(gradle.includedBuild("e2immu-modification-common").task(":test"))
    dependsOn(gradle.includedBuild("e2immu-modification-io").task(":test"))
    dependsOn(gradle.includedBuild("e2immu-aapi-parser").task(":test"))
}
tasks.register("clean") {
    dependsOn(gradle.includedBuilds.map { it.task(":clean") })
}
tasks.register("publish") {
    dependsOn(gradle.includedBuild("e2immu-aapi-archive").task(":publish"))
    dependsOn(gradle.includedBuild("e2immu-aapi-parser").task(":publish"))
}
tasks.register("publishToMavenLocal") {
    dependsOn(gradle.includedBuild("e2immu-aapi-archive").task(":publishToMavenLocal"))
    dependsOn(gradle.includedBuild("e2immu-aapi-parser").task(":publishToMavenLocal"))
}
