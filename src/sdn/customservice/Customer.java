package sdn.customservice;

/**
 * @author lxy
 */
public class Customer {
    /* 私有成员变量 */
    private String userid; 		// 用户Id
    private String password; 	// 用户密码
    private String username; 	// 用户名
    private String addr; 		// 地址
    private String city; 		// 所在城市


    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }


}
