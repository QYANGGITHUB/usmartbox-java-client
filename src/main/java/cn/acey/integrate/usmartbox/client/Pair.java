/*
 * 电商对接API参考文档
 * 电商对接API参考文档
 *
 * OpenAPI spec version: 2.2.2
 * Contact: qyang@yicksolutions.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package cn.acey.integrate.usmartbox.client;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-28T13:01:18.478Z[GMT]")public class Pair {
    private String name = "";
    private String value = "";

    public Pair (String name, String value) {
        setName(name);
        setValue(value);
    }

    private void setName(String name) {
        if (!isValidString(name)) return;

        this.name = name;
    }

    private void setValue(String value) {
        if (!isValidString(value)) return;

        this.value = value;
    }

    public String getName() {
        return this.name;
    }

    public String getValue() {
        return this.value;
    }

    private boolean isValidString(String arg) {
        if (arg == null) return false;
        if (arg.trim().isEmpty()) return false;

        return true;
    }
}
