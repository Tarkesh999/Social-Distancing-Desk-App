import React, { useEffect, useState } from "react"
import UserService from "../services/UserService"

export const UserComponent = () => {
  const [users, setUsers] = useState([])

  useEffect(() => {
    UserService.getusers().then((response) => {
      setUsers(response.data)
    })
  }, [])

  return (
    <div>
      <h1>User List</h1>
      {users.map((user) => (
        <div
          key={user.empID}
        >{`Name: ${user.name}, Email : ${user.email} `}</div>
      ))}
    </div>
  )
}
