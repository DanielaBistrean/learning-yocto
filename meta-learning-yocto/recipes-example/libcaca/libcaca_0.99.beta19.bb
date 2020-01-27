DESCRIPTION = "libcaca is a graphics library that outputs text instead of pixels"
LICENSE = "GPLv2"

LIC_FILES_CHKSUM = "file://COPYING.GPL;md5=4325afd396febcb659c36b49533135d4"

SRC_URI = "http://caca.zoy.org/files/${PN}/${PN}-${PV}.tar.gz"
SRC_URI[md5sum] = "a3d4441cdef488099f4a92f4c6c1da00"
SRC_URI[sha256sum] = "128b467c4ed03264c187405172a4e83049342cc8cc2f655f53a2d0ee9d3772f4"

S = "${WORKDIR}/${PN}-${PV}"

# Give an extra parameter to the configure script
EXTRA_OECONF += "--enable-ncurses"

# Include the autotools specific build functionality
inherit autotools

# Add packages for python wrapper and binary tools
PACKAGES += "${PN}-python"
PACKAGE_BEFORE_PN += "${PN}-tools"

FILES_${PN}-python = "${libdir}/python2.7"
FILES_${PN}-tools = "${bindir}"

# Declare build dependency on ncurses
DEPENDS += "ncurses"
