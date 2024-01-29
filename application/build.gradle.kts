plugins {
    id("java")
}

group = "com.fullcycle.admin.catalog.application"

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":domain"))
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}