package ${PACKAGE_NAME};
#parse("File Header.java")

import junit.framework.Test;
import junit.framework.TestSuite;
import junit.framework.TestCase;

#if (${TESTED_CLASS_PACKAGE_NAME} != "" && ${TESTED_CLASS_NAME} != "")
import ${TESTED_CLASS_PACKAGE_NAME}.${TESTED_CLASS_NAME};
#end

/**
 * ${TESTED_CLASS_NAME} Tester.
 *
 * @author Andre Mermegas
 */
 public class ${NAME} extends TestCase {
#if (${TESTED_CLASS_NAME} != "")
   ${TESTED_CLASS_NAME} ${TESTED_CLASS_VARIABLE_NAME};
#end

    public ${NAME}(String name)
    {
        super(name);
    }

    public void setUp() throws Exception
    {
        super.setUp();
    }

    public void tearDown() throws Exception
    {
        super.tearDown();
    }

    public static Test suite()
    {
        return new TestSuite(${NAME}.class);
    }
}