import axios from "axios";
import { useEffect } from "react";
import { useState } from "react";
import { BASE_URL } from "../../utils/requests";
import { formatLocalDate } from "../../utils/format"

const DataTable = () => {

    const [page, setPage] = useState({
        first: true,
        last: false,
        number: 0,
        totalElements: 0,
        totalPages: 0
    });

    useEffect(() => {
        async function fetchData() {
            const res = await axios.get(`${BASE_URL}/records/page?id=2&page=0&linesPerPage=24&orderBy=date&direction=DESC`)
            setPage(res.data)
        }

        fetchData()
    }, [])

    return (
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
    )
}

export default DataTable;