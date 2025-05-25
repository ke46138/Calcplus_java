plugins {
    id("java")
}

group = "org.example"
version = "2.0"

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.fasterxml.jackson.core:jackson-core:2.18.4")
    implementation("com.fasterxml.jackson.core:jackson-annotations:2.18.4")
    implementation("com.fasterxml.jackson.core:jackson-databind:2.18.4")
}
