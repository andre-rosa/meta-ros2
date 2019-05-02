# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Example plugin for RViz - documents and tests RViz plugin development"
AUTHOR = "William Woodall <william@osrfoundation.org>"
HOMEPAGE = "https://github.com/ros2/rviz"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=01c2bc31767ccb3a68e12f02612b2a97"

ROS_BPN = "rviz_rendering_tests"

ROS_BUILD_DEPENDS = " \
    qtbase \
    resource-retriever \
    rviz-rendering \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    resource-retriever \
    rviz-rendering \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    resource-retriever \
    rviz-rendering \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-cppcheck \
    ament-cmake-cpplint \
    ament-cmake-gmock \
    ament-cmake-gtest \
    ament-cmake-lint-cmake \
    ament-cmake-uncrustify \
    ament-index-cpp \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros2-gbp/rviz-release/archive/release/bouncy/rviz_rendering_tests/4.0.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "ee4c1cfa3a56c965a3290dffa4c103b4"
SRC_URI[sha256sum] = "7eaa51dc42eaecb74db32950c02dc9b01732a5ed62a9b31fefcc3cbc7abbfe7b"
S = "${WORKDIR}/rviz-release-release-bouncy-rviz_rendering_tests-4.0.2-0"

ROS_BUILD_TYPE = "ament_cmake"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/rviz/rviz_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/rviz/rviz_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/rviz/rviz-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/rviz/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/rviz/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
