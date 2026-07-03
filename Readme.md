[![Build Status](https://github.com/gocd-contrib/java-cloning/actions/workflows/build.yml/badge.svg)](https://github.com/gocd-contrib/java-cloning/actions/workflows/build.yml?query=branch%3Amaster)

## Summary
The cloning library is a small, open source (Apache licensed) Java library which deep-clones objects. The objects don't have to implement the Cloneable interface. Effectively, this library can clone ANY Java object. It can be used i.e. in cache implementations if you don't want the cached object to be modified or whenever you want to create a deep copy of objects.

Here is an example of its usage:

```java
Cloner cloner = new Cloner();

MyClass clone = cloner.deepClone(o);
// clone is a deep-clone of o
```

**IMPORTANT** : deep cloning of Java classes might mean thousands of objects are cloned! Also cloning of files and streams might make the JVM crash. Enable dumping of cloned classes to stdout during development is highly recommended in order to view what is cloned.

## gocd-contrib Fork

This fork is used by [GoCD](https://github.com/gocd/gocd) ([website](https://www.gocd.org)), changing some defaults to be more suitable for modern Java 17+ in particular. It may be merged back into the original library if level of maintenance is able to improve.

- Requires Java 21+
- Removes `sun.misc.Unsafe` usage and `UnsafeAccessor`, defaulting to `VarHandleAccessor` with fallback to reflection only when absolutely necessary (usually for final fields)

Currently it is only available through [https://jitpack.io](https://jitpack.io).

```groovy
repositories {
  maven { url = 'https://jitpack.io' }
}

dependencies {
  implementation 'com.github.gocd-contrib:cloning:2.0.0-jdk21'
}
```

Thanks to [Kostas Kougios](https://github.com/kostaskougios) for the original library, which still has some maintenance.

## Useful links
* [Usage details and examples](USAGE.md)
* [Development](DEVELOPMENT.md)
