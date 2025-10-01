# Lab-2-6667

# Notes about compilation:

-> What Is the -cp or -classpath Option?

Using the classpath, we can define a set of directories or files such as *.jar, *.zip that our source code depends on during compilation. Alternatively, we can set the CLASSPATH environment variable.

We should note that the classpath option has higher precedence than the environment variable.

If none of them are specified, then the classpath is assumed to be the current directory. When we wish to specify multiple directories, the path separator is ‘:‘ for most operating systems except Windows, where it’s ‘;‘.

-> What Is the -sourcepath Option?

This option makes it possible to specify the top directory where all of our source code that needs compilation resides.

If not specified, the classpath gets scanned for the sources.

-> What Is the -d Option?

We use this option when we want to have all compiled results in one place, separate from the source code. We need to keep in mind that the path we want to specify must exist beforehand.

During compilation, this path is used as a root directory, and sub-folders are created automatically according to the package structure of the classes. If this option is not specified, every single *.class file is written next to their corresponding source code *.java file.

# Compilation

run the makefile (only for windows at the moment)

```bash
make
make run
```