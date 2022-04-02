import React, { Component, useState } from "react";
import AuthService from "../service/AuthService";
import "../../css/home.css";
import axios from "axios";

const Login = () => {
  const [email, setEmail] = useState("");
  const [password, setPassword] = useState("");

  return (
    <div>
      <div className="container-login100">
        <div className="wrap-login100 p-l-55 p-r-55 p-t-80 p-b-30">
          <form
            // action="http://localhost:8080/verify_doctor"
            // method="post"
            className="login100-form validate-form"
            onSubmit={(e) => {
              e.preventDefault();
              axios
                .post("http://localhost:8080/verify_doctor", {
                  uname: email,
                  pass: password,
                })
                .then((res) => {
                  console.log("res", res);
                  console.log(email, password);
                });
            }}
          >
            <span className="login100-form-title p-b-37">Doctor's Login</span>
            <div
              className="wrap-input100 validate-input m-b-20"
              data-validate="Enter username or email"
            >
              <input
                className="input100"
                type="text"
                name="uname"
                placeholder="username or email"
                onChange={(e) => setEmail(e.target.value)}
              />
              <span className="focus-input100" />
            </div>
            <br />

            <div
              className="wrap-input100 validate-input m-b-25"
              data-validate="Enter password"
            >
              <input
                className="input100"
                type="password"
                name="pass"
                placeholder="password"
                onChange={(e) => setPassword(e.target.value)}
              />
              <span className="focus-input100" />
            </div>
            <br />
            <div className="container-login100-form-btn">
              <input
                className="login100-form-btn"
                type="submit"
                value="Sign In"
              />
            </div>
            <br />
            <div className="text-center">
              <a
                href="http://www.localhost:8080/doctor_signup"
                className="txt2 hov1"
              >
                Sign Up
              </a>
            </div>
          </form>
        </div>
      </div>
    </div>
  );
};

export default Login;
