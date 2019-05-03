# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_superflore_generated

DESCRIPTION = "The dwb_critics package"
AUTHOR = "David V. Lu!! <davidvlu@gmail.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BPN = "dwb_critics"

ROS_BUILD_DEPENDS = " \
    angles \
    costmap-queue \
    dwb-core \
    geometry-msgs \
    nav-2d-msgs \
    nav-2d-utils \
    nav2-common \
    nav2-costmap-2d \
    nav2-util \
    pluginlib \
    rclcpp \
    sensor-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    angles \
    costmap-queue \
    dwb-core \
    geometry-msgs \
    nav-2d-msgs \
    nav-2d-utils \
    nav2-costmap-2d \
    nav2-util \
    pluginlib \
    rclcpp \
    sensor-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    angles \
    costmap-queue \
    dwb-core \
    geometry-msgs \
    nav-2d-msgs \
    nav-2d-utils \
    nav2-costmap-2d \
    nav2-util \
    pluginlib \
    rclcpp \
    sensor-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-gtest \
    ament-cmake-pytest \
    ament-lint-auto \
    ament-lint-common \
    launch \
    launch-testing \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/SteveMacenski/navigation2-release/archive/release/crystal/dwb_critics/0.1.7-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "8a6a8db263c08ba1bd4c161cffdd4b05"
SRC_URI[sha256sum] = "0e3089d57956c995c412f80fd13e621dc44777f3d006c4eaf0128f694e746987"
S = "${WORKDIR}/navigation2-release-release-crystal-dwb_critics-0.1.7-0"

ROS_BUILD_TYPE = "ament_cmake"

# Allow the above settings to be overridden.
ROS_RECIPES_TREE := "${@ros_superflore_generated__get_recipes_tree('navigation2', d)}"
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/navigation2/navigation2_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/navigation2/navigation2-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/navigation2/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/navigation2/${BPN}-${PV}.inc

inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
