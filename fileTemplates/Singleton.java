#parse("File Header.java")
package ${PACKAGE_NAME};

public class ${Name}{
    private static ${Name} ourInstance = new ${Name}();

    public static ${Name} getInstance() {
        return ourInstance;
    }

    private ${Name}() {
    }
}