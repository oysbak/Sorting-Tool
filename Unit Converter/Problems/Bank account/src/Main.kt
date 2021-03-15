// write the BankAccount class here
class BankAccount constructor (var deposited: Long, var withdrawn: Long) {
//    var deposited = deposited
//    var withdrawn = withdrawn
    var balance = deposited - withdrawn
}
