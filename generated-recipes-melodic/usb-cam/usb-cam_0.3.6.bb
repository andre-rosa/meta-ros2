# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "A ROS Driver for V4L USB Cameras"
AUTHOR = "Russell Toris <rctoris@wpi.edu>"
ROS_AUTHOR = "Benjamin Pitzer <benjamin.pitzer@bosch.com>"
HOMEPAGE = "http://wiki.ros.org/usb_cam"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "usb_cam"
ROS_BPN = "usb_cam"

ROS_BUILD_DEPENDS = " \
    camera-info-manager \
    ffmpeg \
    image-transport \
    roscpp \
    sensor-msgs \
    std-msgs \
    std-srvs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    camera-info-manager \
    ffmpeg \
    image-transport \
    roscpp \
    sensor-msgs \
    std-msgs \
    std-srvs \
    v4l-utils \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    camera-info-manager \
    ffmpeg \
    image-transport \
    roscpp \
    sensor-msgs \
    std-msgs \
    std-srvs \
    v4l-utils \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros-gbp/usb_cam-release/archive/release/melodic/usb_cam/0.3.6-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "15edd87c953ee20501093ea8fcb1c8fb"
SRC_URI[sha256sum] = "21a2fa956af929b771c989bdb53a572443481b101cea0ba0b66547e0440a9bd5"
S = "${WORKDIR}/usb_cam-release-release-melodic-usb_cam-0.3.6-0"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('usb-cam', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('usb-cam', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/usb-cam/usb-cam_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/usb-cam/usb-cam-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/usb-cam/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/usb-cam/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
