import { BrowserRouter, Routes, Route } from "react-router-dom";
import "./App.css";
import Navbar from "./components/Navbar";
import EmployeeList from "./components/EmployeeList";
import AddEmployee from "./components/AddEmployee";
import UpdateEmployee from "./components/UpdateEmployee";



function App() {
  return (
    <>
      {/* client side routing */}
      <BrowserRouter>
        <Navbar />
        <Routes>
        {/* route paths added to respond to users actions */}
        <Route path="/" element={<EmployeeList />}></Route>
        <Route path="/addEmployee" element={<AddEmployee />} />
        <Route path="/editEmployee/:id" element={<UpdateEmployee />} />



        </Routes>
      </BrowserRouter>
    </>
  );
}

export default App;
