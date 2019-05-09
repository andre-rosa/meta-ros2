# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_superflore_generated

DESCRIPTION = "These tools inspect and describe your system with macros, types      and functions."
AUTHOR = "Daniel Stonier <d.stonier@gmail.com>"
ROS_AUTHOR = "Daniel Stonier <d.stonier@gmail.com>"
HOMEPAGE = "http://wiki.ros.org/ecl_config"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "ecl_lite"
ROS_BPN = "ecl_config"

ROS_BUILD_DEPENDS = " \
    ecl-build \
    ecl-license \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-ros-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ecl-build \
    ecl-license \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-gtest \
    ament-lint-auto \
    ament-lint-common \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/yujinrobot-release/ecl_lite-release/archive/release/bouncy/ecl_config/1.0.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "a9aa3c5982ea0a56463d1392a2dc4150"
SRC_URI[sha256sum] = "4fe91955bfe56878cc7bed6e16bd7a579c7988c4410002f7d59a978cb0d1679a"
S = "${WORKDIR}/ecl_lite-release-release-bouncy-ecl_config-1.0.0-0"

ROS_BUILD_TYPE = "ament_cmake"
ROS_COMPONENT_TYPE = "${@ros_common__get_component_type('ecl-lite', d)}"

# Allow the above settings to be overridden.
ROS_RECIPES_TREE := "${@ros_superflore_generated__get_recipes_tree('ecl-lite', d)}"
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/ecl-lite/ecl-lite_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/ecl-lite/ecl-lite-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/ecl-lite/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/ecl-lite/${BPN}-${PV}.inc

inherit ros_distro_${ROS_DISTRO}
inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
