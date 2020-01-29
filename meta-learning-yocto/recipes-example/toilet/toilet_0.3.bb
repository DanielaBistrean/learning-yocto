DESCRIPTION = "The TOIlet project attempts to create a free replacement for the FIGlet utility."
LICENSE = "GPLv2"

LIC_FILES_CHKSUM = "file://COPYING;md5=389a9e29629d1f05e115f8f05c283df5"

SRC_URI = "http://caca.zoy.org/raw-attachment/wiki/${PN}/${PN}-${PV}.tar.gz"
SRC_URI[md5sum] = "9b72591cb22a30c42a3184b17cabca6f"

S = "${WORKDIR}/${PN}-${PV}"

inherit autotools pkgconfig

do_configure_prepend () {
    touch "${S}/AUTHORS"
}

FILES_${PN} += "${datadir}"

DEPENDS += "libcaca"
