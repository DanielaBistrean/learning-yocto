DESCRIPTION = "This recipe will install the script"
LICENSE = "CLOSED"

SRC_URI = "file://hello.c"

do_compile () {
    ${CC} ${CFLAGS} ${LDFLAGS} -static ${WORKDIR}/hello.c -o ${WORKDIR}/init
}

do_install () {
    install -d "${D}/dev"
    mknod "${D}/dev/console" c 5 1
    install -m 0755 "${WORKDIR}/init" "${D}/init"
}

FILES_${PN} = "/init /dev"
# RDEPENDS_${PN} += "bash"
