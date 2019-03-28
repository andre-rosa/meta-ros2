# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "rqt is a Qt-based framework for GUI development for ROS. It consists of three parts/metapackages<br/>     <ul>      <li>rqt (you're here)</li>      <li><a href="http://ros.org/wiki/rqt_common_plugins">rqt_common_plugins</a> - ROS backend tools suite that can be used on/off of robot runtime.</li>      <li><a href="http://ros.org/wiki/rqt_robot_plugins">rqt_robot_plugins</a> - Tools for interacting with robots during their runtime.</li>     </ul>    rqt metapackage provides a widget <a href="http://ros.org/wiki/rqt_gui">rqt_gui</a> that enables multiple `rqt` widgets to be docked in a single window."
AUTHOR = "Dirk Thomas <dthomas@osrfoundation.org>"
ROS_AUTHOR = "Dirk Thomas"
HOMEPAGE = "http://ros.org/wiki/rqt"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "rqt"
ROS_BPN = "rqt"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = ""

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    rqt-gui \
    rqt-gui-cpp \
    rqt-gui-py \
    rqt-py-common \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros2-gbp/rqt-release/archive/release/crystal/rqt/1.0.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "6794568afd34fd06d235f9ab4295d08a"
SRC_URI[sha256sum] = "852d0ed7d6535653d84dba6db0e482c78959bbd87a9b0aa1f922fe2eb20cad4a"
S = "${WORKDIR}/rqt-release-release-crystal-rqt-1.0.2-0"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('rqt', d)}"
ROS_BUILD_TYPE = "ament_python"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('rqt', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/rqt/rqt_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/rqt/rqt-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/rqt/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/rqt/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
