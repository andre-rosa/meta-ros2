# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "Drivers for Orbbec Astra Devices."
AUTHOR = "Chris Lalancette <clalancette@openrobotics.org>"
ROS_AUTHOR = "Tim Liu <liuhua@orbbec.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "ros_astra_camera"
ROS_BPN = "astra_camera"

ROS_BUILD_DEPENDS = " \
    boost \
    builtin-interfaces \
    git \
    libusb1 \
    rclcpp \
    sensor-msgs \
    udev \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    boost \
    builtin-interfaces \
    libusb1 \
    rclcpp \
    sensor-msgs \
    udev \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    boost \
    builtin-interfaces \
    libusb1 \
    rclcpp \
    sensor-msgs \
    udev \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros2-gbp/ros_astra_camera-release/archive/release/bouncy/astra_camera/2.1.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "c3a7587850e9cfadcec3746d7addb910"
SRC_URI[sha256sum] = "21269326784bcf416424404ffbfdd1a1d6abc5eb83efdafc4fc8abaa700bebd8"
S = "${WORKDIR}/ros_astra_camera-release-release-bouncy-astra_camera-2.1.1-0"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('ros-astra-camera', d)}"
ROS_BUILD_TYPE = "ament_cmake"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('ros-astra-camera', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/ros-astra-camera/ros-astra-camera_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/ros-astra-camera/ros-astra-camera-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/ros-astra-camera/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/ros-astra-camera/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
