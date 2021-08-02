import axios from "axios";
import { useEffect } from "react";
import { useState } from "react";
import { BASE_URL } from "../../utils/requests";
import { formatLocalDate } from "../../utils/format"
import Pagination from "../Pagination";

const DataTable = () => {

    const [page, setPage] = useState({});
    const [activePage, setActivePage] = useState(0)

    useEffect(() => {
        async function fetchData() {
            const res = await axios.get(`${BASE_URL}/records/page?id=2&page=${activePage}&linesPerPage=24&orderBy=date&direction=DESC`)
            setPage(res.data)
        }

        fetchData()
    }, [activePage])

    const changePage = (index) => {
        index >= 0 && index < page.totalPages && setActivePage(index)
    }

    return (
        <>
            <Pagination page={page} onPageChange={changePage} />
            <div className="table-responsive">
                <table className="table table-striped table-sm">
                    <thead>
                        <tr>
                            <th>ID</th>
                            <th>Data</th>
                            <th>Descrição</th>
                            <th>Valor</th>
                            <th>Tipo</th>
                            <th>Status</th>
                        </tr>
                    </thead>
                    <tbody>
                        {page.content?.map(item => (
                            <tr key={item.id}>
                                <td>{item.id}</td>
                                <td>{formatLocalDate(item.date, "dd/MM/yyyy")}</td>
                                <td>{item.description}</td>
                                <td>{item.value.toFixed(2)}</td>
                                <td>{item.recordType}</td>
                                <td>{item.recordStatus}</td>
                            </tr>
                        ))}
                    </tbody>
                </table>
            </div>
        </>
    )
}

export default DataTable;