# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "map_server provides the <tt>map_server</tt> ROS <a href="http://www.ros.org/wiki/Nodes">Node</a>, which offers map data as a ROS <a href="http://www.ros.org/wiki/Services">Service</a>. It also provides the <tt>map_saver</tt> command-line utility, which allows dynamically generated maps to be saved to file."
AUTHOR = "William Woodall <william@osrfoundation.org>"
ROS_AUTHOR = "Brian Gerkey"
HOMEPAGE = "http://wiki.ros.org/map_server"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=01c2bc31767ccb3a68e12f02612b2a97"

ROS_CN = "navigation"
ROS_BPN = "map_server"

ROS_BUILD_DEPENDS = " \
    geometry-msgs \
    libsdl \
    libsdl-image \
    nav-msgs \
    rclcpp \
    rcutils \
    tf2 \
    yaml-cpp \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    nav-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    libsdl \
    libsdl-image \
    rclcpp \
    rcutils \
    tf2 \
    yaml-cpp \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-gtest \
    ament-cmake-pytest \
    launch-testing \
    rclpy \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros2-gbp/navigation-release/archive/release/bouncy/map_server/3.1.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "adb17c5bca1ea29d6c73784b5c7b946e"
SRC_URI[sha256sum] = "e88e2e3ca3bc362bb239a9676c6eb163f4bacde842ebdee79ee3cdb850dd8ac9"
S = "${WORKDIR}/navigation-release-release-bouncy-map_server-3.1.0-0"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('navigation', d)}"
ROS_BUILD_TYPE = "ament_cmake"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('navigation', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/navigation/navigation_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/navigation/navigation-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/navigation/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/navigation/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
