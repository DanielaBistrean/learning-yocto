DESCRIPTION = "stm32 discovery line linux programmer"
LICENSE = "GPLv2"

LIC_FILES_CHKSUM = "file://LICENSE;md5=a119cf258a06d6a2c7f4da37ca03e341"
SRC_URI[md5sum] = "f9aa3cbad062f8648c8c7915c45d4638"

SRC_URI = "https://github.com/texane/${PN}/archive/v${PV}.tar.gz"
S = "${WORKDIR}/${PN}-${PV}"

EXTRA_OECONF += "-DSTLINK_GENERATE_MANPAGES=on"

inherit cmake

DEPENDS += "libusb1"
