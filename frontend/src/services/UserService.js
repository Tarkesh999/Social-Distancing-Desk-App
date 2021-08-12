import axios from "axios"

const USER_REST_API_URL = "http://localhost:8000/list"

class UserService {
  getusers() {
    return axios.get(USER_REST_API_URL)
  }
}

export default new UserService()
