#Distribution Library [![Release](https://jitpack.io/v/openintents/distribution.svg)](https://jitpack.io/#openintents/distribution)

A small library to add About and Support menu items into your apps as well as handling EULA.

## How to use
### Add dependency
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

### Add app details
Replace strings
* oi_distribution_recent_changes
* oi_distribution_license_short

Add about details in meta data in AndroidManifest.xml or through intent:
* customized logo (EXTRA_ICON_RESOURCE or EXTRA_ICON_URI) 
* customized application label (EXTRA_APPLICATION_LABEL) as String
* comments (EXTRA_COMMENTS, METADATA_COMMENTS , oi:comments) as String
* copyright (EXTRA_COPYRIGHT, METADATA_COPYRIGHT, oi:copyright) as String
* website link (EXTRA_WEBSITE_LABEL and EXTRA_WEBSITE_URL, METADATA_WEBSITE_LABEL and METADATA_WEBSITE_URL, oi:website-label and  oi:website-url) as String 
* authors (EXTRA_AUTHORS, METADATA_AUTHORS, oi:authors) as StringArray
* documenters (EXTRA_DOCUMENTERS, METADATA_DOCUMENTERS, oi:documenters) as StringArray
* translators (EXTRA_TRANSLATORS, METADATA_TRANSLATORS, oi:translators) as StringArray or String
* artists (EXTRA_ARTISTS, METADATA_ARTISTS, oi:artists) as StringArray
* list of translators (METADATA_TRANSLATORS, oi:translators) as a resource id for a String
* license (EXTRA_LICENSE_RESOURCE, METADATA_LICENSE, oi:license) as resource id to raw file
* support email (EXTRA_EMAIL, METADATA_EMAIL, oi:email) as String
* recent changes (EXTRA_RECENT_CHANGES_RESOURCE, METADATA_RECENT_CHANGES, oi:recent-changes) as resource id to raw file

Translators are only listed if the string resource is not equals to `translator-credits` otherwise all international translators are listed
