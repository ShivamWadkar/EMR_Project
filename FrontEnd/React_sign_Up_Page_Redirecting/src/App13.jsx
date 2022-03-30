import { useState } from "react";
import { Navigate } from "react-router-dom";
import axios from "axios";
export const Sahil12 = () => {
  const [data, setData] = useState({});
  const handleInput = (e) => {
    const { className, value } = e.target;
    setData({ ...data, [className]: value });
  };

  const checkUser = () => {
    axios.get("http://localhost:3001/data").then((res) => {
      let x = res.data;
      let flag = false;
      x.forEach((e) => {
        if (e.name === data.name && e.password === data.password) {
          flag = true;
          localStorage.setItem("userData", JSON.stringify(data));
          return;
        }
      });
      if (flag) {
        window.location.href = "http://localhost:8080/patient_signup";
      } else alert("invalid credentials");
    });
  };
  const handleSubmit = (e) => {
    e.preventDefault();
    checkUser();
  };
  return (
    <div className="form">
      <div>
        <h1>User Registration</h1>
      </div>
      <form
        onSubmit={(e) => {
          handleSubmit(e);
        }}
      >
        <input
          type="text"
          className="name"
          onChange={(e) => {
            handleInput(e);
          }}
          placeholder="enter a name"
        />
        <input
          className="password"
          type="password"
          placeholder="enter a password"
          onChange={(e) => {
            handleInput(e);
          }}
        />
        <input type="submit" value="submit" />
      </form>
    </div>
  );
};
