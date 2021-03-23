 # Week10GradedExercise
 
- For ITSA 2020-21 Term 2
- Open this repo in IntelliJ
- Compile this repo with JDK 11
- Always do `maven clean` before pushing

## Fix Log

2021/03/24

- changed ItemSubjectService class to Singleton pattern 

```java
private static ItemSubjectService INSTANCE;

public static ItemSubjectService getINSTANCE() {
    if (INSTANCE == null) {
        INSTANCE = new ItemSubjectService();
    }
    return INSTANCE;
}
```

Minor Note:

- All interface modifiers are implicitly public. 
