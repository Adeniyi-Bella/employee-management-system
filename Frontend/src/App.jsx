import { BrowserRouter, Routes, Route } from "react-router-dom";
import "./App.css";
import Navbar from "./components/Navbar";
import EmployeeList from "./components/EmployeeList";
import AddEmployee from "./components/AddEmployee";


function App() {
  return (
    <>
      {/* client side routing */}
      <BrowserRouter>
        <Navbar />
        <Routes>

        <Route path="/" element={<EmployeeList />}></Route>
        <Route path="/addEmployee" element={<AddEmployee />} />


        </Routes>
      </BrowserRouter>
    </>
  );
}

export default App;
