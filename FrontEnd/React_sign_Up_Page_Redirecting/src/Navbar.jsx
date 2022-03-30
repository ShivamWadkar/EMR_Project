import React from "react";
import { Link } from "react-router-dom";
import AllRoutes from "./Routes";
function Navbar() {
  return (
    <div>
      <Link to="/">Home</Link>
      &emsp;
      <Link to="/user">User</Link>
      <AllRoutes />
    </div>
  );
}

export default Navbar;
