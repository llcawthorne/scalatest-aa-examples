package mocks

import org.scalatest.FunSuite
import org.scalatest.BeforeAndAfter
import org.scalatest.mock.MockitoSugar
import org.mockito.Mockito._

class LoginServiceTests extends FunSuite with BeforeAndAfter with MockitoSugar {

  test("test login service") {

    // (1) init
    val service = mock[LoginService]

    // (2) setup: when someone logs in as "johndoe", the service should work;
    //            when they try to login as "joehacker", it should fail.
    when(service.login("johndoe", "secret")).thenReturn(Some(User("johndoe")))
    when(service.login("joehacker", "secret")).thenReturn(None)

    // (3) access the service
    val johndoe = service.login("johndoe", "secret")
    val joehacker = service.login("joehacker", "secret")

    // (4) verify the results
    assert(johndoe.get == User("johndoe"))
    assert(joehacker == None)
    
  }

}