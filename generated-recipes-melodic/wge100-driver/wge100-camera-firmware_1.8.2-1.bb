# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "Source for the WGE100 Ethernet camera: Verilog source for the     FPGA, Forth source for the camera firmware.  Intended for camera     developers.  Note that a built binary from this package is checked     in under wge100_camera/firmware_images/"
AUTHOR = "Austin Hendrix <ahendrix@willowgarage.com>"
ROS_AUTHOR = "James Bowman"
HOMEPAGE = "http://ros.org/wiki/wge100_camera_firmware"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=16;endline=16;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "wge100_driver"
ROS_BPN = "wge100_camera_firmware"

ROS_BUILD_DEPENDS = " \
    gforth \
    rospy \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    gforth \
    rospy \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    gforth \
    rospy \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    rostest \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros-drivers-gbp/wge100_driver-release/archive/release/melodic/wge100_camera_firmware/1.8.2-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "6c55238e0b26506f44a7e44f1f579fd5"
SRC_URI[sha256sum] = "4e0908e101472e4247b1c23782764c9576b37103db122bd196de406e9e951e50"
S = "${WORKDIR}/wge100_driver-release-release-melodic-wge100_camera_firmware-1.8.2-1"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('wge100-driver', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('wge100-driver', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/wge100-driver/wge100-driver_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/wge100-driver/wge100-driver-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/wge100-driver/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/wge100-driver/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
