# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "Scripts and tools for running the application manager on the PR2."
AUTHOR = "ROS Orphaned Package Maintainers <ros-orphaned-packages@googlegroups.com>"
ROS_AUTHOR = "Vijay Pradeep"
HOMEPAGE = "http://ros.org/wiki/application_manager"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "pr2_apps"
ROS_BPN = "pr2_app_manager"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    app-manager \
    willow-maps \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    app-manager \
    willow-maps \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/pr2-gbp/pr2_apps-release/archive/release/melodic/pr2_app_manager/0.6.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "5b6e5a6fe0459eda8a03fae6343e167b"
SRC_URI[sha256sum] = "efb64b17c3475ef039056ad31ceeebc17296ff0be259a5507b0b8e6fdcffb93b"
S = "${WORKDIR}/pr2_apps-release-release-melodic-pr2_app_manager-0.6.1-0"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('pr2-apps', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('pr2-apps', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/pr2-apps/pr2-apps_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/pr2-apps/pr2-apps-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/pr2-apps/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/pr2-apps/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
