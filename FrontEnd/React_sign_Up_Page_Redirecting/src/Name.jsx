import React, { useState } from "react";

function Name() {
  const [data, setData] = useState(
    JSON.parse(localStorage.getItem("userData")) || { name: "", password: "" }
  );
  return <h1>{data.name}</h1>;
}

export default Name;
