# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_superflore_generated

DESCRIPTION = "TODO"
AUTHOR = "Carl Delsey <carl.r.delsey@intel.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_CN = "navigation2"
ROS_BPN = "dwb_controller"

ROS_BUILD_DEPENDS = " \
    boost \
    dwb-core \
    nav-2d-msgs \
    nav-2d-utils \
    nav2-common \
    nav2-msgs \
    nav2-robot \
    nav2-tasks \
    nav2-util \
    rclcpp \
    std-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    boost \
    dwb-core \
    nav-2d-msgs \
    nav-2d-utils \
    nav2-msgs \
    nav2-robot \
    nav2-tasks \
    nav2-util \
    rclcpp \
    std-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    boost \
    dwb-core \
    nav-2d-msgs \
    nav-2d-utils \
    nav2-msgs \
    nav2-robot \
    nav2-tasks \
    nav2-util \
    rclcpp \
    std-msgs \
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

SRC_URI = "https://github.com/SteveMacenski/navigation2-release/archive/release/crystal/dwb_controller/0.1.7-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "ada7784f303b97309d8e830856ffd148"
SRC_URI[sha256sum] = "450f6b6b59a11f491adbd99d2ceaf1e150a11f337e4d64b84738e3159dd974d4"
S = "${WORKDIR}/navigation2-release-release-crystal-dwb_controller-0.1.7-0"

ROS_BUILD_TYPE = "ament_cmake"
ROS_COMPONENT_TYPE = "${@ros_common__get_component_type('navigation2', d)}"

# Allow the above settings to be overridden.
ROS_RECIPES_TREE := "${@ros_superflore_generated__get_recipes_tree('navigation2', d)}"
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/navigation2/navigation2_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/navigation2/navigation2-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/navigation2/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/navigation2/${BPN}-${PV}.inc

inherit ros_distro_${ROS_DISTRO}
inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
