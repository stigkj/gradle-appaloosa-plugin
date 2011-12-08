# Appaloosa plugin for Gradle

The Appaloosa Gradle plugin deploys Android applications to [Appaloosa](http://appaloosa-store.com).

## Usage
To use the plugin, include the following in your build script:

```groovy
apply plugin: appaloosa

buildscript {
    repositories {
        mavenCentral()
    }
    dependencies {
        classpath 'net.nisgits.gradle:gradle-appaloosa-plugin:1.0'
    }
}
```