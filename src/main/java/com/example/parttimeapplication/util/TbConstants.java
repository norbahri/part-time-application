package com.example.parttimeapplication.util;

public class TbConstants {

    // Role constants
    public static final String DEFAULT_ROLE = "ROLE_USER";
    public static final String ADMIN_ROLE = "ROLE_ADMIN";
    public static final String USER_ROLE = "ROLE_USER";

    // URL constants
    public static final String LOGIN_URL = "/login";
    public static final String LOGOUT_URL = "/logout";
    public static final String REGISTRATION_URL = "/registration";
    public static final String USER_URL = "/user";
    public static final String ADMIN_URL = "/admin";

    // View names
    public static final String LOGIN_VIEW = "login";
    public static final String REGISTRATION_VIEW = "registration";
    public static final String USER_VIEW = "user";

    // Redirect URLs
    public static final String REDIRECT_LOGIN = "redirect:/login";
    public static final String REDIRECT_REGISTRATION = "redirect:/registration";
    public static final String REDIRECT_USER = "redirect:/user";

    // Parameters
    public static final String SUCCESS_PARAM = "success";
    public static final String ERROR_PARAM = "error";
    public static final String LOGOUT_PARAM = "logout";

    private TbConstants() {
        // Private constructor to prevent instantiation
    }
}