DESCRIPTION = "This image is capable of allowing a device to boot"
LICENSE = "CLOSED"

inherit core-image
IMAGE_INSTALL = "packagegroup-core-boot ${CORE_IMAGE_EXTRA_INSTALL}"
CORE_IMAGE_EXTRA_INSTALL += "mc vim"
