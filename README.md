#Distribution Library [![Release](https://jitpack.io/v/openintents/distribution.svg)](https://jitpack.io/#openintents/distribution)

A small library to add About and Support menu items into your apps as well as handling EULA.

## How to use
In your `build.gradle`
```
repositories {
    jcenter()
    maven { url "https://jitpack.io" }
}

dependencies {
    compile 'com.github.openintents:distribution:{latest version}'
}
```

###
Replace strings
* oi_distribution_recent_changes
* oi_distribution_license_short

Add about details in meta data in AndroidManifest.xml
