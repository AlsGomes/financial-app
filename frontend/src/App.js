import React from 'react';
import DataTable from './components/DataTable';
import Footer from './components/Footer';
import NavBar from './components/NavBar';

function App() {
  return (
    <>
      <NavBar />
      <div className="content container">
        <DataTable />
      </div>
      <Footer />
    </>
  );
}

export default App;
