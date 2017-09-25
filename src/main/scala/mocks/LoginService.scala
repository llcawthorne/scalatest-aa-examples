package mocks

// a very simple User class
case class User(name: String)

// a LoginService must have a 'login' method
trait LoginService {
  def login(name: String, password: String): Option[User]
}

// the code for our real/live LoginService
class RealLoginService extends LoginService {
  // implementation here...
  def login(name: String, password: String): Option[User] = ???
}