import React from "react";
import { Routes, Route } from "react-router-dom";
import { Sahil12 } from "./App13";
import Name from "./Name";

function AllRoutes() {
  return (
    <Routes>
      <Route path="" element={<Sahil12 />}></Route>
      <Route path="/user" element={<Name />}></Route>
    </Routes>
  );
}

export default AllRoutes;
