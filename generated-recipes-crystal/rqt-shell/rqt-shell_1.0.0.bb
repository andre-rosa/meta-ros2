# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "rqt_shell is a Python GUI plugin providing an interactive shell."
AUTHOR = "Dorian Scholz <scholz@sim.tu-darmstadt.de>"
HOMEPAGE = "http://wiki.ros.org/rqt_shell"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    python-qt-binding \
    python3-catkin-pkg-modules \
    qt-gui \
    qt-gui-py-common \
    rqt-gui \
    rqt-gui-py \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros2-gbp/rqt_shell-release/archive/release/crystal/rqt_shell/1.0.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "00e6c95cc2a7245fd6d8dbeb50228850"
SRC_URI[sha256sum] = "5a8ea5e58a69cf9d636cf5fb54acc62e8c3d2ad5acea86c0361c2d613c1fb6ab"
S = "${WORKDIR}/rqt_shell-release-release-crystal-rqt_shell-1.0.0-0"

ROS_BUILD_TYPE = "ament_cmake"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/rqt-shell/rqt-shell_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/rqt-shell/rqt-shell_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/rqt-shell/rqt-shell-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/rqt-shell/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/rqt-shell/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
