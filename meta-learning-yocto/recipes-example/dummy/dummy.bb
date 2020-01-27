DESCRIPTION = "Dummy recipe"
LICENSE = "CLOSED"

do_print () {
    bbnote "It works! Yuppy! :-)"
}

addtask do_print before do_compile
