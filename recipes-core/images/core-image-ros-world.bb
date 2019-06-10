DESCRIPTION = "An image with packagegroup-ros-world installed"

IMAGE_INSTALL = "packagegroup-core-boot ${CORE_IMAGE_EXTRA_INSTALL}"

IMAGE_LINGUAS = " "

LICENSE = "MIT"

inherit core-image
inherit ros_distro_${ROS_DISTRO}
inherit ${ROS_DISTRO_TYPE}_image

IMAGE_ROOTFS_SIZE = "8192"

IMAGE_INSTALL += "packagegroup-ros-world"
