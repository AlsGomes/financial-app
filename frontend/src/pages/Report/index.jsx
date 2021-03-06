import React from 'react';
import DataTable from '../../components/DataTable';
import Footer from '../../components/Footer';
import NavBar from '../../components/NavBar';

const Report = () => {
    return (
        <>
            <NavBar />
            <div className="content container">
                <DataTable />
            </div>
            <Footer />
        </>)
}

export default Report;