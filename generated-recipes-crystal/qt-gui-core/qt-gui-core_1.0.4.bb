# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Integration of the ROS package system and ROS-specific plugins for a Qt-based GUI."
AUTHOR = "Dirk Thomas <dthomas@osrfoundation.org>"
HOMEPAGE = "http://ros.org/wiki/qt_gui_core"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    qt-dotgraph \
    qt-gui \
    qt-gui-app \
    qt-gui-cpp \
    qt-gui-py-common \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    qt-dotgraph \
    qt-gui \
    qt-gui-app \
    qt-gui-cpp \
    qt-gui-py-common \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros2-gbp/qt_gui_core-release/archive/release/crystal/qt_gui_core/1.0.4-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "36c55fbedd905202a423e3d8602b0d00"
SRC_URI[sha256sum] = "93c1fed52a831d2b681f225525bb9a42218931f7f2d31dd484add4913e815cfe"
S = "${WORKDIR}/qt_gui_core-release-release-crystal-qt_gui_core-1.0.4-0"

ROS_BUILD_TYPE = "ament_cmake"
ROS_RECIPES_TREE = "recipes-ros2"
ROS_DEPENDENCY_GROUPS = ""

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/qt-gui-core/qt-gui-core_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/qt-gui-core/qt-gui-core_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/qt-gui-core/qt-gui-core-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/qt-gui-core/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/qt-gui-core/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
inherit ${@ros_superflore_generated__prefix_all('ROS_DEPENDENCY_GROUPS', 'ros_depgrp_', d)}
