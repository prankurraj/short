package edu.boun.cmpe451.group2.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;

import edu.boun.cmpe451.group2.exception.ExError;
import edu.boun.cmpe451.group2.exception.ExException;
import edu.boun.cmpe451.group2.model.UserModel;

/**
 * API Controller Class
 * This class includes following functions
 */
@Controller
@RequestMapping("api")
@Scope("request")
public class APIController {

    @Qualifier("userModel")
    @Autowired
    private UserModel userModel = null;

    /**
     * Checks login
     *
     * @param email    registered email
     * @param password password
     * @return
     */
    @RequestMapping("/login")
    @ResponseBody
    public String login(
            @RequestParam String email,
            @RequestParam String password) {

        Gson gson = new Gson();
        Map<String, Object> result = new HashMap<String, Object>();

        try {
            String api_key = userModel.login(email, password);
            result.put("type", "SUCCESS");
            result.put("content", ExError.S_OK);
            result.put("api_key", api_key);

            return gson.toJson(result);

        } catch (Exception e) {
            e.printStackTrace();

            result.put("type", "ERROR");

            if (e instanceof ExException)
                result.put("content", ((ExException) e).getErrCode());
            else
                result.put("content", ExError.E_UNKNOWN);

            return gson.toJson(result);
        }
    }

    /**
     * Register user to database
     *
     * @param email     registered email
     * @param password  password
     * @param full_name full name
     * @return
     */
    @RequestMapping("/signup")
    @ResponseBody
    public String signup(
            @RequestParam String email,
            @RequestParam String password,
            @RequestParam(required = false) String full_name,
            @RequestParam(required = false) String username) {

        Gson gson = new Gson();
        Map<String, Object> result = new HashMap<String, Object>();

        try {
            String api_key = userModel.signup(email, password, full_name, username);

            result.put("type", "SUCCESS");
            result.put("content", ExError.S_OK);
            result.put("api_key", api_key);

            return gson.toJson(result);

        } catch (Exception e) {
            e.printStackTrace();

            result.put("type", "ERROR");

            if (e instanceof ExException)
                result.put("content", ((ExException) e).getErrCode());
            else
                result.put("content", ExError.E_UNKNOWN);

            return gson.toJson(result);
        }
    }
}