package edu.mjkay.library

import org.scalatest.FunSpec

class LibrarySpec extends FunSpec {
  describe("Adding 1 to 1") {
    it("should equals 2"){
      assert(1+1 == 2)
    }
  }
}